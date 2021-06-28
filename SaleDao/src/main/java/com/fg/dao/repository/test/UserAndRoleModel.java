package com.fg.dao.repository.test;

import lombok.*;

import javax.persistence.*;


@NamedNativeQuery(
        name = "queryByEntIdAndRoleIds",
        resultClass = UserAndRoleModel.class,
        query = "select u.id as userId, u.login_name as loginName, u.user_name as userName, r.`name` as roleName, r.id as roleId " +
                "from user u " +
                "inner join r_user_role ur on u.id = ur.euser_id " +
                "inner join role r on r.id = ur.role_id " +
                "where u.state = 2 and u.frozen_state = 0 " +
                "   and u.ent_id = :entId and ur.role_id in (:roleIds) "

                ,
        resultSetMapping = "userAndRoleModelMapping")
@MappedSuperclass
@SqlResultSetMapping(
        name = "userAndRoleModelMapping",
        classes = @ConstructorResult(
                targetClass = UserAndRoleModel.class,
                columns = {
                        @ColumnResult(name = "userId", type = Long.class),
                        @ColumnResult(name = "loginName", type = String.class),
                        @ColumnResult(name = "userName", type = String.class),
                        @ColumnResult(name = "roleId", type = Long.class),
                        @ColumnResult(name = "roleName", type = String.class),
                }
        )
)

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserAndRoleModel {

    private Long userId;
    private String loginName;
    private String userName;

    private Long roleId;
    private String roleName;
}