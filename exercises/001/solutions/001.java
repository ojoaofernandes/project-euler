class Exercise001 {

    public void resolve() {
        long sum = 0l;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Exercise001().resolve();
    }

}