mainTableCols = [{
    checkbox: true
}, {
    field: 'col1',
    title: '對象代號'
}, {
    field: 'col1',
    title: '款項'
}, {
    field: 'col1',
    title: '預計繳款'
}, {
    field: 'col1',
    title: '通知日'
}, {
    field: 'col1',
    title: '繳款日'
}, {
    field: 'col1',
    title: '預計金額'
}, {
    field: 'col1',
    title: '實繳金額'
}, ];

$(function() {
    let $table = $("#table");
    bsTableInit($table, mainTableCols);

    let $btnAdd = $("#btnAdd");
    $btnAdd.click(function() {
        $table.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
            }
        });
    });

    let $getTableData = $("#getTableData");
    $getTableData.click(function() {
        alert(JSON.stringify($table.bootstrapTable('getData')));
    });

});