mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: 'NO'
}, {
    field: 'name2',
    title: '項目代號'
}, {
    field: 'name2',
    title: '項目'
}, {
    field: 'name2',
    title: '單位'
}, {
    field: 'name2',
    title: '數量'
}, {
    field: 'name2',
    title: '單價'
}, {
    field: 'name2',
    title: '金額'
}, ];

$(function() {
    let $table3 = $("#table3");
    bsTableInit($table3, mainTableCols);

    let $btnAdd3 = $("#btnAdd3");
    $btnAdd3.click(function() {
        $table3.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
            }
        });
    });

});