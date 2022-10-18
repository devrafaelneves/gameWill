public class Personagens {
    String nome;
    boolean vivo=true;
    int vida=100;
    int defesa=2;
    int poderAtaque=5;
    int nivel=1;
    int xp=0;
    // Personagens alvo

    public void atacar(Personagens alvo) {
        System.out.println(this.nome + " atacou " + alvo.nome);

        int dano = this.poderAtaque - alvo.defesa;
        if(dano>0){
            alvo.vida -= dano;
            this.xp +=10;
            this.verXp();
            System.out.println(alvo.nome + " ficou com " + alvo.vida);

            if(alvo.vida<=0){
                alvo.vivo=false;
                System.out.println(alvo.nome + " MORREU");
                System.out.println("Parabéns "+ this.nome+" você venceu!!");
            }
        }
else{
    System.out.println("Muito forte, nao sofreu dano");
}
        // o que tava tentando
        // this.vida = this.vida - (this.poderAtaque-this.defesa);
}

    public void verXP(){
        if (this.xp >= 100){
            this.nivel++;
            this.defesa+=2;
            this.poderAtaque+=5;
            this.xp = this.xp - 100;
            System.out.println(this.nome + " subiu um nivel, seu nivel atual é: " + this.nivel);
            this.recuperar ();
        }

    }
    public void treinar() { 
        this.xp += 50;
        System.out.println(this.nome + "treinou");
        this.verXp();
       
    //      tava tentando 
    // if (this.xp>30){
    //         this.nivel = this.nivel + 1;
    //     }
    //     this.xp = this.xp + 
    // 30 =- 1lvl
}
    public void recuperar(int vida) {
        this.vida += 10;
        if (this.vida>100){
            this.vida = 100;
        }
        System.out.println(this.nome + " se recuperou. Sua vida agora é:" + this.vida);


        // this.vida = this.vida + 5 
}

public void info() {

    System.out.println("O nome do personagem é: " + nome);
    System.out.println("Vida: "+ vida);
    System.out.println("Defesa: "+ defesa);
    System.out.println("Poder: "+ poderAtaque);
    System.out.println("Nível: "+ nivel);
    System.out.println("XP: "+ xp);
    }
}




    
    // public void luta() {

    //     ataque = vida - (ataque - defesa);

    //     }
    // }