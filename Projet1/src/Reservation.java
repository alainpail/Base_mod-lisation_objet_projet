import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import residence.Partie;
import residence.service;

@objid ("43461150-56c8-4ebe-9d91-c29917348162")
public class Reservation {
    @objid ("37668212-f9ad-4b03-b8a4-5a10ee8f80a5")
    public Date date_debut;

    @objid ("d4771541-aabe-4e73-bc40-2f536e8f3a2a")
    public Date date_fin;

    @objid ("38776ac2-e776-47af-bd44-d78671c072a0")
    public Utilisateur clients;

    @objid ("aba55414-b9ed-4fec-beeb-4849c0ee3807")
    public service services;

    @objid ("191a2deb-ed02-44c9-a9fd-3a0aca9fe87a")
    public residence resid;

    @objid ("f2d57685-f38e-4270-815c-72e766c4fc64")
    public Partie part;

}
