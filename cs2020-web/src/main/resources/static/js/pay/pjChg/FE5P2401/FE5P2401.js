mainTableCols = [{
    checkbox: true
}, {
    field: 'code2',
    title: '項目代號'
}, {
    field: 'name2',
    title: '項目名稱'
}, ];

$(function() {
    let $tableACs = $("#tableACs");
    bsTableInit($tableACs, mainTableCols);

    let $btnAddACs = $("#btnAddACs");
    $btnAddACs.click(function() {
        $tableACs.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code2: '',
                name2: '',
            }
        });
    });

    let $getTableDataACs = $("#getTableDataACs");
    $getTableDataACs.click(function() {
        alert(JSON.stringify($tableACs.bootstrapTable('getData')));
    });

});