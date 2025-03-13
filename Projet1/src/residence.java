import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eff32c31-7a3e-47f0-8d8d-91d66bc73345")
public class residence {
    @objid ("74014b86-74d6-4beb-9ee8-11ffd890c21d")
    public String address ;

    @objid ("b47e3b36-c090-4a73-806e-db02bca7942f")
    public String nom;

    @objid ("81ff27e4-bfd2-461e-a6d7-cb8da0bb9542")
    public String Description;

    @objid ("ac3b2fec-2610-4ef7-8f9d-7dbcd066e556")
    public Avis[] Avist;

    @objid ("a8c0afa1-b058-478f-bcbb-7b8c7c6c2b36")
    public service[] services;

    @objid ("9c9a9ddb-9959-4b34-9e70-9557e272882f")
    public disponibilite disponiblite;

    @objid ("c6d924cc-6527-4858-bc60-8a1ee4222529")
    public Partie parties;

    @objid ("b467d818-fb4b-4c84-94f1-b34f71479b00")
    public void Operation() {
    }

    @objid ("8b0f7f0c-a1be-41f9-8181-05d5d360b8a7")
    public class service {
        @objid ("9af29409-1b95-48e2-8f3f-b2c39fa20e3c")
        public String Nom;

        @objid ("37d1f076-6048-45b5-ab93-936b0cf4e0d0")
        public int Tarifs;

    }

    @objid ("0cb1af0f-518d-459e-a85e-f0e03aed6f29")
    public class disponibilite {
        @objid ("bb244784-e444-4a06-bf59-59653279386a")
        private String[] Calendrier;

        @objid ("75999ee2-a4b9-4810-8c0d-4d03e4b804e0")
        private boolean[] Dispo;

        @objid ("cb56f9f2-05e9-4542-b9c4-04fce44f5378")
        public List<Boolean> get_Disponibilité (final Date date_début, final Date date_fin) {
            // TODO Auto-generated return
            return false;
        }

    }

    @objid ("70ab250c-0845-4d7b-a828-ca68c06a1a20")
    public class Partie {
        @objid ("a3290b05-d965-4b30-9681-cb3b8861974f")
        public String Nom;

        @objid ("223b63cd-f8e2-4cdd-8736-acfba12e3595")
        public int tarifs;

    }

}
