import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import residence.service;

@objid ("52a10bbb-6721-4e96-a6e7-5a4795c241ad")
public class Utilisateur {
    @objid ("3210140d-d8fb-47d8-be13-8775949eae70")
    public String Nom;

    @objid ("c13bad75-90c4-4c94-bf58-c9be9cbf07b0")
    public String Prenom;

    @objid ("69bbae29-704a-49e3-92a6-613f87f5209b")
    public String ID;

    @objid ("ff4324e0-59ef-4942-9bcf-b76631d8b14f")
    public int numero_de_CB;

    @objid ("f7b40e26-c86b-4a29-9612-97557a8db1ee")
    public Reservation[] Reservations;

    @objid ("d600abb9-329f-4d0d-827f-10e0beb458b8")
    public String numero_compte;

    @objid ("4c3615b9-80f2-49f1-8643-604547c46d21")
    public void reserver(final Date date_debut, final Date Date_fin, final residence Residence, final List<service> services) {
    }

}
