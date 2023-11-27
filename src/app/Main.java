package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            double[] dailyPrices = {20.5, 18.9, 22.3, 25.0, 19.8, 21.2, 23.7};

            bubbleSort(dailyPrices);

            System.out.println("Sorted Prices: " + Arrays.toString(dailyPrices));

            double averagePrice = calculateAverage(dailyPrices);

            System.out.printf("Average Price: %.2f ", averagePrice);
        }
        public static void bubbleSort(double[] prices) {
            int n = prices.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (prices[j] > prices[j+1]) {
                        double TemporaryValue = prices[j];
                        prices[j] = prices[j+1];
                        prices[j+1] = TemporaryValue;
                    }
                }
            }
        }public static double calculateAverage(double[] prices) {
            double sum = 0;
            for (double price : prices) {
                sum += price;
            }
            return sum / prices.length;
        }
    }
