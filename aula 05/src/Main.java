public class Main {
    public static void main(String[] args) {

        //int[] arr = new int[5];

      //  arr[0] = 10;
       // arr[1] = 20;
       // arr[2] = 30;
       // arr[3] = 40;
       // arr[4] = 50;

       // System.out.println("Vetor: " + arr[2]);

        //for (int i = 0; i < arr.length; i++) {
            //System.out.println("Array: " + i + " --> " + arr[i]);



           // double[] notas = {7.0, 9.8, 6.0 , 8.6, 7.5};
           // double soma = 0;

            //for (double nota:notas){
            //    soma += nota;
           // }

           // System.out.printf("Média da turma: %.1f", (soma / notas.length) );

       // }


//        int [] [] matriz = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//
//        for (int i = 0; i < matriz.length; i++){
//            for (int j = 0; j < matriz[i].length; j++){
//                System.out.println(matriz[i][j]);
//            }
//        }

//        public class ExemploVetorObjetos {
//            public static void main(String[] args) {
                Aluno[] turma = new Aluno[3];

                turma[0] = new Aluno("Maria", 20);
                turma[1] = new Aluno("João", 22);
                turma[2] = new Aluno("Pedro", 21);

                for (Aluno aluno : turma) {
                    System.out.println(aluno);
                }
    }
}
