package fr.epsi;

import fr.epsi.banque.*;

import fr.epsi.bo.Emprunt;
//import fr.epsi.bo.Client;
import fr.epsi.bo.Livre;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa-pu");
//
//        // Find un livre
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Livre livre = em.find(Livre.class, 4);
//        System.out.println(livre);
//
//        // Création d'une entité Livre en base
//        EntityTransaction et = em.getTransaction();
//        Livre livreACreer = new Livre("Martine à la plage", "Marcel Marlier");
//        em.persist(livreACreer);
//        System.out.println(livreACreer);
//
//        // Modification de l'entité livre en base
//        Livre livreAModifier = em.find(Livre.class, 5);
//        if (livreAModifier != null) {
//            livreAModifier.setTitre("1001 recettes de Cuisine");
//        }
//
//        // Extraire un livre en fonction de son titre
//        TypedQuery<Livre> query = em.createQuery("FROM LIVRE WHERE titre = 'Germinal'", Livre.class);
//        List<Livre> livreList = query.getResultList();
//        System.out.println(livreList);
//
//        // Extraire un livre en fonction de son auteur
//        TypedQuery<Livre> queryAuteur = em.createQuery("FROM LIVRE WHERE auteur = 'Marcel Marlier'", Livre.class);
//        List<Livre> livreListAuteur = queryAuteur.getResultList();
//        System.out.println(livreListAuteur);
//
//        // Delete de l'entité livre en base
//        Livre livreASup = em.find(Livre.class, 7);
//        if (livreASup != null) {
//            em.remove(livreASup);
//        }
//
//        // Afficher tous les livres
//        TypedQuery<Livre> findAllQuery = em.createQuery("FROM LIVRE", Livre.class);
//        System.out.println(findAllQuery.getResultList());
//
//        // Récupération du client 2 et affichage de ses emprunts
//        Client client = em.find( Client.class, 2);
//        if (client != null) {
//            for (Emprunt item : client.getEmprunts()) {
//                System.out.println(item);
//            }
//        }
//
////        // Récupérer un emprunt et tous ses livres associés
////        Emprunt emprunt = em.find(Emprunt.class, 2);
////        System.out.println(emprunt);
////        for (Livre item : emprunt.getLivres()) {
////            System.out.println(item);
////        }
//
//        em.getTransaction().commit();
//
//        em.close();
//        emf.close();

//       ------------------------------------------------------------------------- TP-JPA-04 ---------------------------------------------------------------------------
        EntityManagerFactory emfBanque = Persistence.createEntityManagerFactory("demo-jpa-banque");
        EntityManager emBanque = emfBanque.createEntityManager();
        emBanque.getTransaction().begin();

        Banque banque = new Banque("BNP");
        banque.addClient(new Client("Jean"));
        emBanque.persist(banque);

        // Insérer un compte associé à 2 clients


        // Insérer un client avec plusieurs comptes
        // Un compte de type assurance vie
        // Un compte de type livret A

        // Insérer des opérations de type virements sur un compte

        // Insérer des opérations de type opérations sur un compte

        emBanque.getTransaction().commit();

        emBanque.close();
        emfBanque.close();
    }
}