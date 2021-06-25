mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: '戶名'
}, {
    field: 'name2',
    title: '存匯代號'
}, {
    field: 'name2',
    title: '項目'
}, {
    field: 'name2',
    title: '期數'
}, {
    field: 'name2',
    title: '預計金額'
}, {
    field: 'name2',
    title: '實繳金額'
}, {
    field: 'name2',
    title: '繳款方式'
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