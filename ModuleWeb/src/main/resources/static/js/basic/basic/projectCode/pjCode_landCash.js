mainTableColsLc = [{
    checkbox: true
}, {
    field: 'chisu',
    title: '期數'
}, {
    field: 'priceKind',
    title: '款項'
}, {
    field: 'priceName',
    title: '款項名稱'
}, {
    field: 'per',
    title: '百分比'
}, {
    field: 'price',
    title: '金額'
}, ];

$(function() {
    let $tableLC = $("#tableLC");
    bsTableInit($tableLC, mainTableColsLc);

    let $btnAddLC = $("#btnAddLC");
    $btnAddLC.click(function() {
        $tableLC.bootstrapTable('insertRow', {
            index: 0,
            row: {
                chisu: '',
                priceKind: '',
                priceName: '',
                per: '',
                price: '',
            }
        });
    });

    let $getTableDataLC = $("#getTableDataLC");
    $getTableDataLC.click(function() {
        alert(JSON.stringify($tableLC.bootstrapTable('getData')));
    });

});