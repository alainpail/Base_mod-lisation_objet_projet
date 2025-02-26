import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d518e93d-f789-4690-935c-89f757c08887")
public class Gestionnaire  {
    @objid ("403ac6e8-e41b-42fc-a640-62fc8c87802d")
    public residence[] residences;

    @objid ("12fd8993-7a26-44fd-9027-42afcd848511")
    public void gerer_tarifs (final String periode, int tarifs, final residence residence) {
    }

    @objid ("70f5283d-b035-46c0-b967-b206c740d0f2")
    public void gerer_les_disponibilites (final Date date_debut, final String date_fin, final residence residence , final boolean disponible) {
    }

    @objid ("b7912cdb-6621-4cfe-a087-0f5972677d9c")
    public boolean verifDispo(final Date date_debut, final Date date_fin) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("5260c672-7568-4cf4-ab6f-8d007eb23600")
    public boolean accepterReservation(final Utilisateur clients, final String résidence) {
        // TODO Auto-generated return
        return false;
    }

}
