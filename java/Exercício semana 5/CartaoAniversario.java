public class CartaoAniversario extends CartaoWeb{

    public CartaoAniversario(String destinatario){
        super(destinatario);
    }

    public String retornarMensagem(String remetente){
        return "Aniver" + remetente;
    }
}