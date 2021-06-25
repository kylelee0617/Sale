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
    let $table2 = $("#table2");
    bsTableInit($table2, mainTableCols);

    let $btnAdd2 = $("#btnAdd2");
    $btnAdd2.click(function() {
        $table2.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
            }
        });
    });

});