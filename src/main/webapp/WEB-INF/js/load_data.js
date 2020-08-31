window.onload = function () {

    $.ajax({
        type: 'GET',
        url: "http:localhost:8080/api/select_latest",
        contentType: "application/json;cherset=utf-8",
        dataType: "json",
        success: function (histories){
        $('.table_node').empty()
      //取出后端传过来的list值
       var chargeRuleLogs = histories.histories
      //对list值进行便利
       $.each(chargeRuleLogs, function (index, n) {
        var rowTr = document.createElement('tr')
        //找到html的tr节点
        rowTr.className = "tr_node"
        var child = "<td>" + chargeRuleLogs[index].month +  "</td>"
            + "<td>" + chargeRuleLogs[index].ver + "</td>"
            + "<td>" + chargeRuleLogs[index].bizPretty + "</td>"
            + "<td>"+chargeRuleLogs[index].bizRangePretty + "</td>"
            + "<td>" + chargeRuleLogs[index].count + "</td>"
        //将要展示的信息写入页面
        rowTr.innerHTML = child
        //将信息追加
        $(".table_node").append(rowTr)
    });
}
});
}
