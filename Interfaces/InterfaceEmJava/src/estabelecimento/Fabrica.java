package estabelecimento;

import equipamentos.copiadora.copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.deskjet;
import equipamentos.impressora.impressora;
import equipamentos.impressora.laserjet;
import equipamentos.multifuncoes.EquipamentoMulti;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMulti em = new EquipamentoMulti();
        
        deskjet dj = new deskjet();

        impressora impressora = em;
        digitalizadora scanner = em;
        copiadora copiadora = em; 

        impressora.imprimir();
        scanner.digitalizar();
        copiadora.copiar();
        System.out.println("Equipamento multifuncional criado com sucesso!");
    }
    
}
