package algorithm.Array;

public class MaxProfit {
    public static void main(String[] args) {

    }

    /**
     * Cho mảng giá cổ phiếu theo từng ngày, tìm lợi nhuận lớn nhất
     * khi chỉ được mua 1 lần và bán 1 lần (phải mua trước rồi mới bán).
     * Nếu không có giao dịch nào sinh lời, trả về 0.
     * Ví dụ: {7, 1, 5, 3, 6, 4} -> 5 (mua giá 1, bán giá 6)
     */
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int profitToday = prices[i] - minPrice;
            if (profitToday > maxProfit) maxProfit = profitToday;
            if (prices[i] < minPrice) minPrice = prices[i];
        }
        return maxProfit;
    }
}
