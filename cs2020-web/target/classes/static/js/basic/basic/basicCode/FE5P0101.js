mainTableCols = [{
    checkbox: true
}, {
    field: 'code1',
    title: '細項代碼'
}, {
    field: 'name1',
    title: '名稱'
}, {
    field: 'used',
    title: '啟用'
}, ];

$(function() {
    let $tableACs = $("#tableACs");
    bsTableInit($tableACs, mainTableCols, []);

    let $btnAddACs = $("#btnAddACs");
    $btnAddACs.click(function() {
        $tableACs.bootstrapTable('insertRow', {
            index: 0,
            row: {
                code1: '',
                name1: '',
                used: '',
            }
        });
    });

	let $btnDelACs = $("#btnDelACs");
	$btnDelACs.click(function() {
        var ids = $.map($tableACs.bootstrapTable('getSelections'), function (row) {
            return row.code1;
        });
        if (ids.length == 0 ) {
            //bootbox.alert("請選擇一行刪除!");
            return;
        }
        $tableACs.bootstrapTable('remove', {
            field: 'code1',
            values: ids
        });
    });

    let $getTableDataACs = $("#getTableDataACs");
    $getTableDataACs.click(function() {
        alert(JSON.stringify($tableACs.bootstrapTable('getData')));
    });

});

function query(){
	console.log(".....");
	var code1 = $.trim($("#code1").val());
  var name1 = $("#name1").val();
  if(!code1){
  	return;
  }

	$.ajax({
        url: "/page/basic/basic/doQuery",
        type: 'post',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify({code1 : code1, name1 : name1}),
        async: true,
        success: function(data){
            if(data != null){
            	//console.log('data=' + data);
            	if(data.resEnum.code == "0" && data.data != null){
            		let $tableACs = $("#tableACs");
            		$('#tableACs').bootstrapTable('destroy');
            		bsTableInit($("#tableACs"), mainTableCols, data.data);
            	}
            }
        },error:function(error){
        console.log(error);
        }
    });
}