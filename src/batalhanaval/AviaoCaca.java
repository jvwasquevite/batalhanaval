package batalhanaval;

public class AviaoCaca implements Embarcacao {
    private final String nomeEmbarcacao;
    private int tamanhoEmbarcacao;
    private boolean statusEmbarcacao;

    public AviaoCaca() {
        this.nomeEmbarcacao = "Avião Caça";
        this.tamanhoEmbarcacao = 2;
        this.statusEmbarcacao = true;
    }
    
    @Override
    public String getNomeEmbarcacao() {
        return nomeEmbarcacao;
    }

    @Override
    public int getTamanhoEmbarcacao() {
        return tamanhoEmbarcacao;
    }
    
    @Override
    public void setTamanhoEmbarcacao(int tamanho) {
        this.tamanhoEmbarcacao = tamanho;
    }
    
    @Override
    public boolean getStatusEmbarcacao() {
        return statusEmbarcacao;
    }
    
    @Override
    public void setStatusEmbarcacao(boolean status) {
        this.statusEmbarcacao = status;
    }

    @Override
    public void explodirEmbarcacao() {
        if(getTamanhoEmbarcacao() > 0){
            setTamanhoEmbarcacao(getTamanhoEmbarcacao() - 1);
        } else if(getTamanhoEmbarcacao() == 0) {
            setStatusEmbarcacao(false);
        }
    }
}
