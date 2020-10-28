package co.soft.beans;

public class PageBean {
	
	// 최소 ?��?���? 번호
	private int min;
	// 최�? ?��?���? 번호
	private int max;
	// ?��?�� 버튼?�� ?��?���? 번호
	private int prevPage;
	// ?��?�� 버튼?�� ?��?���? 번호
	private int nextPage;
	// ?���? ?��?���? 개수
	private int pageCnt;
	// ?��?�� ?��?���? 번호
	private int currentPage;
	
	
	// contentCnt : ?��체�? 개수, currentPage : ?��?�� �? 번호, contentPageCnt : ?��?���??�� �??�� 개수, paginationCnt : ?��?���? 버튼?�� 개수
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
		
		// ?��?�� ?��?���? 번호
		this.currentPage = currentPage;
		
		// ?���? ?��?���? 개수
		pageCnt = contentCnt / contentPageCnt;
		if(contentCnt % contentPageCnt > 0) {
			pageCnt++;
		}
		
		min = ((currentPage - 1) / contentPageCnt) * contentPageCnt + 1;
		max = min + paginationCnt - 1;
		
		if(max > pageCnt) {
			max = pageCnt;
		}
		
		prevPage = min - 1;
		nextPage = max + 1;
		if(nextPage > pageCnt) {
			nextPage = pageCnt;
		}
	}
	
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	
	
}
