package equipamentos.multifuncoes;
import equipamentos.copiadora.copiadora;
import equipamentos.impressora.impressora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.digitalizadora.scanner;

public class EquipamentoMulti implements copiadora, impressora, digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");  
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");  
    }

    @Override
    public void digitalizar() {
        System.out.println("Escaneando via equipamento multifuncional");  
    }
    
}
