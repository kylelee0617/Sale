mainTableCols = [{
    field: 'objectCd',
    title: '客戶'
}, {
    field: 'remitDate',
    title: '交屋完成日'
}, {
    field: 'lastYmd',
    title: '產權登記日'
}, {
    field: 'total',
    title: '總金額'
},{
    field: 'realAmt',
    title: '實繳金額'
},{
    field: 'loanAmt',
    title: '銀貸金額'
},{
    field: 'balance',
    title: '餘額'
},];

$(function() {

    let $tableACs = $("#tableACs");
    bsTableInit($tableACs, mainTableCols, []);

    let $getTableDataACs = $("#getTableDataACs");
    $getTableDataACs.click(function() {
        alert(JSON.stringify($tableACs.bootstrapTable('getData')));
    });

});

