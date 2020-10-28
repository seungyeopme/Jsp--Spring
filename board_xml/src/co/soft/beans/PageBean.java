package co.soft.beans;

public class PageBean {
	
	// ìµœì†Œ ?˜?´ì§? ë²ˆí˜¸
	private int min;
	// ìµœë? ?˜?´ì§? ë²ˆí˜¸
	private int max;
	// ?´? „ ë²„íŠ¼?˜ ?˜?´ì§? ë²ˆí˜¸
	private int prevPage;
	// ?‹¤?Œ ë²„íŠ¼?˜ ?˜?´ì§? ë²ˆí˜¸
	private int nextPage;
	// ? „ì²? ?˜?´ì§? ê°œìˆ˜
	private int pageCnt;
	// ?˜„?¬ ?˜?´ì§? ë²ˆí˜¸
	private int currentPage;
	
	
	// contentCnt : ? „ì²´ê? ê°œìˆ˜, currentPage : ?˜„?¬ ê¸? ë²ˆí˜¸, contentPageCnt : ?˜?´ì§??‹¹ ê¸??˜ ê°œìˆ˜, paginationCnt : ?˜?´ì§? ë²„íŠ¼?˜ ê°œìˆ˜
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
		
		// ?˜„?¬ ?˜?´ì§? ë²ˆí˜¸
		this.currentPage = currentPage;
		
		// ? „ì²? ?˜?´ì§? ê°œìˆ˜
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
