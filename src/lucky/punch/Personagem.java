package lucky.punch;

public class Personagem {

    
    private String nome, tipo;
    private int level, vida, ataque, defesa;

   
    public Personagem(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        
        getRandomLevel();
        calculaAtributo();
        calculaBonus();
        imprimeLutador();
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void imprimeLutador() {
        System.out.println("Nome: " + nome + " | "
                + "Estilo de luta: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defesa: " + defesa + " | "
        );
    }

    public void calculaAtributo() {
        switch (this.tipo) {
            case "Agressivo":
                this.vida = 60;
                this.ataque = 150;
                this.defesa = 50;
                break;

            case "Defensivo":
                this.vida = 75;
                this.ataque = 50;
                this.defesa = 150;
                break;

            case "Resistencia":
                this.vida = 75;
                this.ataque = 75;
                this.defesa = 75;
                break;

            case "Agil":
                this.vida = 75;
                this.ataque = 120;
                this.defesa = 120;
                break;

        }

    }

    public void calculaBonus() {
        vida = vida + (level / 4);
        ataque = ataque + (level / 4);
        defesa = defesa + (level / 4);

    }

    public void imprimiLutador() {

        System.out.println(
                "Nome: " + nome + " | "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defesa: " + defesa + "\n");

    }

    private void getRandomLevel() {
        int number = (int) Math.round(Math.random() * 100);
        this.level = number;
    }

}