package geektech;

public class Runners extends Thread {
        private final int numbers;

        public Runners(String name, int numbers) {
            super(name);
            this.numbers = numbers;
        }

        @Override
        public void run() {
            super.run();
            System.out.println(this.getName() + this.numbers + " берёт палащкэ");
            System.out.println(this.getName() + this.numbers + " бежитъ к " + this.getName() + (this.numbers + 1));
            if(this.numbers==4) {
                for (int i = this.numbers+1; i > 0; i--) {
                    try{
                        Runners.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i==1){
                        System.out.println(this.getName()+1+" берёт палащку и финиширует!");
                        break;
                    }
                    System.out.println(this.getName() + i + " берёт палащкэ");
                    System.out.println(this.getName() + i + " бежит к " + this.getName() + (i- 1));
                }
            }
        }
}
