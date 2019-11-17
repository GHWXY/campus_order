function adding(obj){
	var uid= $("#uid").val();
	var sum =$("#zong1").text();
	window.location.href="/confirmorder?sum="+sum+"&uid="+uid;

}
$(document).ready(function () {
	// 全选        
	$(".allselect").click(function () {
		$(".gwc_tb2 input[name=sCheckbox]").each(function () {
			$(this).attr("checked", true);
		});
		GetCount();
	});

	//反选
	$("#invert").click(function () {
		$(".gwc_tb2 input[name=sCheckbox]").each(function () {
			if ($(this).attr("checked")) {
				$(this).attr("checked", false);

			} else {
				$(this).attr("checked", true);

			} 
		});
		GetCount();
	});
	//取消
	$("#cancel").click(function () {
		$(".gwc_tb2 input[name=sCheckbox]").each(function () {
			$(this).attr("checked", false);

		});
		GetCount();
	});

	// 所有复选(:checkbox)框点击事件
	$(".gwc_tb2 input[name=sCheckbox]").click(function () {
		if ($(this).attr("checked")) {

		} else {

		}
	});

	// 输出
	$(".gwc_tb2 input[name=sCheckbox]").click(function () {

		GetCount();
	});
});
//******************
function GetCount() {
	var conts = 0;
	var aa = 0;
	$(".gwc_tb2 input[name=sCheckbox]").each(function () {
		if ($(this).attr("checked")) {
			for (var i = 0; i < $(this).length; i++) {
				conts += parseInt($(this).val());
				aa += 1;
			}
		}
	});
	$("#shuliang").text(aa);
	$("#zong1").html((conts).toFixed(2));
	$("#jz1").css("display", "none");
	$("#jz2").css("display", "block");
}
//ADD:对删除链接进行处理
    /*$(document).ready(function(){
		$("#delcart1").click(function(){
			$("#table1").remove();
			});
		$("#delcart2").click(function(){
			$("#table2").remove();
			});
		});*/
<!--商品加减算总数-->
function add(obj) {
	var id = $(obj).prev().val() ;
	var t = $("#text_box"+id);
	t.val((parseInt(t.val()) + 1));
		setTotal();
		GetCount();
	function setTotal() {
		$("#total"+id).html((parseInt(t.val()) * $("#price"+id).text()).toFixed(2));
		$("#newslist-"+id).val((parseInt(t.val()) * $("#price"+id).text()).toFixed(2));
	}

}
function cut(obj){
	var id = $(obj).prev().val() ;
	var t = $("#text_box"+id);
	t.val(parseInt(t.val()) - 1)
	if(t.val()<=1){
		t.val(1);//初始值防止为负数
	}
	setTotal();
	GetCount();
	function setTotal() {
		$("#total"+id).html((parseInt(t.val()) * $("#price"+id).text()).toFixed(2));
		$("#newslist-"+id).val(parseInt(t.val()) * $("#price"+id).text());
	}
}

<!--总数-->
	$(function () {
		$(".quanxun").click(function () {
			setTotal();
			//alert($(lens[0]).text());
		});
		function setTotal() {
			var len = $(".tot");
			var num = 0;
			for (var i = 0; i < len.length; i++) {
				num = parseInt(num) + parseInt($(len[i]).text());

			}
			//alert(len.length);
			$("#zong1").text(parseInt(num).toFixed(2));
			$("#shuliang").text(len.length);
		}
		//setTotal();
	})
//add to cart shoppage
var data = {"total":0,"rows":[]};
		var totalCost = 0;
		
		$(function(){
			$('#cartcontent').datagrid({
				singleSelect:true
			});
			$('.item').draggable({
				revert:true,
				proxy:'clone',
				onStartDrag:function(){
					$(this).draggable('options').cursor = 'not-allowed';
					$(this).draggable('proxy').css('z-index',2);
				},
				onStopDrag:function(){
					$(this).draggable('options').cursor='move';
				}
			});
			$('.cart').droppable({
				onDragEnter:function(e,source){
					$(source).draggable('options').cursor='auto';
				},
				onDragLeave:function(e,source){
					$(source).draggable('options').cursor='not-allowed';
				},
				onDrop:function(e,source){
					var name = $(source).find('p:eq(0)').html();
					var price = $(source).find('p:eq(1)').html();
					addProduct(name, parseFloat(price.split('￥')[1]));
				}
			});
		});
		
		function addProduct(name,price){
			function add(){
				for(var i=0; i<data.total; i++){
					var row = data.rows[i];
					if (row.name == name){
						row.quantity += 1;
						return;
					}
				}
				data.total += 1;
				data.rows.push({
					name:name,
					quantity:1,
					price:price
				});
			}
			add();
			totalCost += price;
			$('#cartcontent').datagrid('loadData', data);
			$('div.cart .total').html('共计金额: ￥'+totalCost);
		}