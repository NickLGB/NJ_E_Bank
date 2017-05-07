package util;

public class Pagination {
public static String getPagination(int pageNum,int pageCount,int recordCount,String pageUrl){
	String url=pageUrl.contains("?")?pageUrl:pageUrl + "?";
	if(!url.endsWith("?")&&!url.endsWith("&")){
		url+="&";
	}
	StringBuffer buffer = new StringBuffer() ;
	buffer.append("�� " + pageNum + "/" + pageCount + "ҳ ��" + recordCount + "��¼"); 
	buffer.append(pageNum==1?"��һҳ":"<a href='"+ url + "pageNum=1'>��һҳ</a>");
	buffer.append(pageNum==1?"��һҳ":"<a href='"+ url + "pageNum="+(pageNum-1)+"'>��һҳ</a>");
	buffer.append(pageNum==pageCount?"��һҳ":"<a href='"+ url + "pageNum="+(pageNum+1)+"'>��һҳ</a>");
	buffer.append(pageNum==pageCount?"���һҳ":"<a href='"+ url + "pageNum="+pageCount+"'>���һҳ</a>");
	return buffer.toString();
}
}

