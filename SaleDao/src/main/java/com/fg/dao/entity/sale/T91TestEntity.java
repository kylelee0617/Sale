package com.fg.dao.entity.sale;

import lombok.*;

import javax.persistence.*;


@NamedNativeQuery(
        name = "queryByEntIdAndRoleIdsT91test",
        resultClass = T91TestEntity.class,
        query = "select customNo as customNo , customName as customName from Sale05m091 where orderNo = :orderNo",
        resultSetMapping = "userAndRoleModelMappingT91test")
@MappedSuperclass
@SqlResultSetMapping(
        name = "userAndRoleModelMappingT91test",
        classes = @ConstructorResult(
                targetClass = T91TestEntity.class,
                columns = {
                        @ColumnResult(name = "customNo", type = Long.class),
                        @ColumnResult(name = "customName", type = String.class),
                }
        )
)

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class T91TestEntity {
    private String customNo;
    private String customName;
}