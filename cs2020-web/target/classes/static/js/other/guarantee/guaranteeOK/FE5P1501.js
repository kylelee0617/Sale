mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: '客戶'
}, {
    field: 'name2',
    title: '經辦人及電話'
}, {
    field: 'name2',
    title: '銀行對保日'
}, {
    field: 'used',
    title: '代書用印'
}, {
    field: 'code2',
    title: '對保方式'
}, {
    field: 'code2',
    title: '證件確認'
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