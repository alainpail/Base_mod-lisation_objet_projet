import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("98a47b0c-7d81-40b6-b971-b49807191705")
public class systeme_de_payement  {
    @objid ("b0761c26-0e64-4c10-aa1f-04c950aa84b6")
    public Utilisateur clients;

    @objid ("53b045c3-d9c7-43d4-a6fd-bf29d43a9633")
    public Reservation reservation;

    @objid ("57fc9f79-1399-4c64-8dec-8cb59d582289")
    public int apayer;

    @objid ("ab6e8a95-71a4-4a97-a0ef-6b8221228156")
    public int resteApayer;

    @objid ("e53da2bb-4f54-46d6-b05d-63a98aa0383c")
    public void payement(final boolean plusieursfois , final int somme) {
    }

}
