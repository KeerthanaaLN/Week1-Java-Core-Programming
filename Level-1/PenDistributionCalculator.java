class PenDistributionCalculator{
    public static void main(String[] args) {
        int total_pens=14, total_students=3;
		int per_student=total_pens/total_students;
		int remaining_pen = total_pens%total_students;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d\n",per_student,remaining_pen);
    }
}