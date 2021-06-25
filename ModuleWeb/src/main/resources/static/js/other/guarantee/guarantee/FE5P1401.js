mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: '項目代碼'
}, {
    field: 'name2',
    title: '項目名稱'
}, {
    field: 'used',
    title: '預計金額'
}, {
    field: 'code2',
    title: '實支金額'
}, {
    field: 'code2',
    title: '備註'
}, ];

$(function() {
    let $table1 = $("#table1");
    bsTableInit($table1, mainTableCols);

    let $btnAdd1 = $("#btnAdd1");
    $btnAdd1.click(function() {
        $table1.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
                used: '',
            }
        });
    });

    let $getTableData1 = $("#getTableData1");
    $getTableData1.click(function() {
        alert(JSON.stringify($table1.bootstrapTable('getData')));
    });

});