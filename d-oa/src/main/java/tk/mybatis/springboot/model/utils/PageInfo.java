package tk.mybatis.springboot.model.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;
import org.springframework.util.StringUtils;



public class PageInfo {

	  private int limit = 10;
	  private int offset = 0;
	  private String order = "asc";
	  private int thisPage = 0;
	  
	  private List<SearchPara> searchParaList = new ArrayList();
	
	
	  public int getLimit()
	  {
	    return this.limit;
	  }

	  public void setLimit(int limit) {
	    this.limit = limit;
	  }

	  public int getOffset() {
	    return this.offset;
	  }

	  public void setOffset(int offset) {
	    this.offset = offset;
	  }

	  public String getOrder() {
	    return this.order;
	  }

	  public void setOrder(String order) {
	    this.order = order;
	  }
	  
	  public int getThisPage()
	  {
	    return this.thisPage;
	  }

	  public void setThisPage(int thisPage) {
	    this.thisPage = thisPage;
	  }
	  
	  public List<SearchPara> getSearchParaList()
	  {
	    return this.searchParaList;
	  }

	  public void setSearchParaList(List<SearchPara> searchParaList) {
	    this.searchParaList = searchParaList;
	  }
	  
	  public PageInfo(String dataStr)
	  {
	    if (!StringUtils.isEmpty(dataStr))
	    {
	      JSONObject data = new JSONObject(dataStr);

	      this.limit = Integer.parseInt(data.get("limit") == null ? "0" : data.get("limit").toString());
	      this.offset = Integer.parseInt(data.get("offset") == null ? "0" : data.get("offset").toString());
	      this.order = (data.get("order") == null ? "" : data.get("order").toString());


	      Iterator it = data.keys();
	      while (it.hasNext()) {
	        String key = (String)it.next();
	        if ((key.contains(SearchPara.SEARCHPARA_PEX)) && (!StringUtils.isEmpty(data.get(key).toString()))) {
	          SearchPara para = new SearchPara();
	          para.ParaName = key.substring(key.indexOf(SearchPara.SEARCHPARA_PEX) + 11);
	          para.ParaValue = data.get(key).toString();
	          this.searchParaList.add(para);
	        }
	      }

	      if (this.offset != 0) {
	        this.thisPage = (this.offset / this.limit);
	      }
	    }
	    this.thisPage += 1;
	  }
	
}
