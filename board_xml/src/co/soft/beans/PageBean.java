package co.soft.beans;

public class PageBean {
	
	// μ΅μ ??΄μ§? λ²νΈ
	private int min;
	// μ΅λ? ??΄μ§? λ²νΈ
	private int max;
	// ?΄?  λ²νΌ? ??΄μ§? λ²νΈ
	private int prevPage;
	// ?€? λ²νΌ? ??΄μ§? λ²νΈ
	private int nextPage;
	// ? μ²? ??΄μ§? κ°μ
	private int pageCnt;
	// ??¬ ??΄μ§? λ²νΈ
	private int currentPage;
	
	
	// contentCnt : ? μ²΄κ? κ°μ, currentPage : ??¬ κΈ? λ²νΈ, contentPageCnt : ??΄μ§??Ή κΈ?? κ°μ, paginationCnt : ??΄μ§? λ²νΌ? κ°μ
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
		
		// ??¬ ??΄μ§? λ²νΈ
		this.currentPage = currentPage;
		
		// ? μ²? ??΄μ§? κ°μ
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
