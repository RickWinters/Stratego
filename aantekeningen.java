public class aantekeningen {
    public static void main(String[] args) {
        /*
        UML diagrammen.


        SCM (Source Code management)
        Git, een programma om een repository op te starten en te managene
        een repository is een plek voor source code (dropbox voor developers)
        Github is een programma waarmee een gitrepository gedeeld kan worden met een server
        command 'push' betekend een repository delen met de server.
        Command 'pull' is een repository ophalen


        In de locale repository kan men iets veranderen
        met 'git add' komen ze in een staging area
        met 'git commit -am' worden de files gepushed naar de off-site repository. Hiermee kan men een berichtje / notitie erbij voeren

         */
        System.out.println("test");
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test4");





        /*
        SQL
        Structured Query Language
        "ik wil alles zien van auto met id 2,"
        SELECT * from care where id = 2,
        SELECT id, price from CAR where id = 2"
        Select (de kolommon) van (tabel) where (velden)


        A database is a set of interconnected relations (tables)
        RDMs Relational Datable Management System
        One to Many reference. Een persoon kan meerdere fietsen hebben, maar een fiets heeft altijd maar 1 eigenaar.

        Linked Table
        In de hoofdtable staan de ID van de afzonderlijke 'many to one' tabellen

            has many    >    users_projects   <          has many
            /\  has one   <     ||            > has one
           | |    \/            ||                 \/        /\
          Users                 ||               Projects
          users aan nummers     ||               en een nummer aan projects
          te koppelen           ||
                                kunnen hier een tabel van user-ids
                                en projects id gemaakt worden

         we gaan mySQL
         lifecycle van een project / tabel is CRUD
         Create
         Read
         Update
         Delete

         syntax:
         SELECT <field names seperated by commas> FROM <table name> WHERE <key> = <value>   Read
         UPDATE <table_name> SET <key> = <newvalue> WHERE <key> = <value>                   Update   veld veranderen
         INSERT <table_name> (<column_name_1, ...) VALUES <value_1, ..)                     Update   rij toevoegen, het aantal values in beide dingen moeten overeenkomen. Een row_id wordt meegegeven automatisch.
         DELETE FROM <table_name> WHERE <key> = <value>                                     Verwijder rij uit tabel

         */

    }
}
