const cols3 = [{
    checkbox: true
}, {
    field: 'chisu',
    title: '對象名稱'
}, {
    field: 'priceKind',
    title: '期別'
}, {
    field: 'priceName',
    title: '次數'
}, {
    field: 'per',
    title: '款項'
}, {
    field: 'price',
    title: '款項名稱'
}, {
    field: 'type',
    title: '實際日'
}, {
    field: 'type',
    title: '金額'
}, {
    field: 'type',
    title: '匯入信託'
}, {
    field: 'type',
    title: '帳號'
}, {
    field: 'type',
    title: '備註'
}, {
    field: 'type',
    title: '流水號'
}, ];


$(function() {
    let $table3 = $("#table3");
    bsTableInit($table3, cols3);

    let $btnAdd3 = $("#btnAdd3");
    $btnAdd3.click(function() {
        $table3.bootstrapTable('insertRow', {
            index: 0,
            row: {
                chisu: '',
                priceKind: '',
                priceName: '',
                per: '',
                price: '',
                type: '',
            }
        });
    });

    let $getTableData = $("#getTableData");
    $getTableData.click(function() {
        alert(JSON.stringify($table3.bootstrapTable('getData')));
    });

});