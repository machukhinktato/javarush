// проход по массиву
Arrays.stream(strings).forEach(System.out::println); 
Arrays.stream(strings).map(x -> x + ", ").forEach(System.out::print);
