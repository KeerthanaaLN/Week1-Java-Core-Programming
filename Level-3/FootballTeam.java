public class FootballTeam {
	
    public static double sumOfElements(double[] heights) {
        double sum = 0.0;
        for (double height : heights)
            sum += height;
        return sum;
    }

    public static double findMean(double[] heights) {
        return sumOfElements(heights) / heights.length;
    }

    public static double findShortest(double[] heights) {
        double min = heights[0];
        for (double height : heights) {
            if (height < min)
                min = height;
        }
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double height : heights) {
            if (height > max)
                max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        double[] heights = new double[11];
        
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + (Math.random() * 101);

        System.out.printf("Total height: %.2f cm%n", sumOfElements(heights));
        System.out.printf("Mean height: %.2f cm%n", findMean(heights));
        System.out.printf("Shortest height: %.2f cm%n", findShortest(heights));
        System.out.printf("Tallest height: %.2f cm%n", findTallest(heights));
    }
}
