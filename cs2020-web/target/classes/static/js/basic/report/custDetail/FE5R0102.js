
$(function() {
 
	var selectorx = $('select[name="groups"]').bootstrapDualListbox({
      nonSelectedListLabel: '資料源',
      selectedListLabel: '欲列印之資料',
      //filterTextClear: '展示所有',
      filterPlaceHolder: '過濾搜尋',

      moveSelectedLabel: "添加",
      moveAllLabel: '添加所有',
      removeSelectedLabel: "移除",
      removeAllLabel: '移除所有',
      infoText: false,
      //infoText: '共{0}个组',
      //infoTextFiltered: '搜索到{0}个组 ,共{1}个组',
      //infoTextEmpty: '列表为空',
      preserveSelectionOnMove: 'moved',
      moveOnSelect: false,
      showFilterInputs: true,
      filterOnValues: true,
      selectorMinimalHeight: 5,
      helperSelectNamePostfix: '_selected'
  });
});