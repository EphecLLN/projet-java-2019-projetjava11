# Cahier des charges

Les fonctionnalités décrites dans ce présent cahier des charges seront développées en fonction de l’avancement du projet.
En finalité, nous devrions avoir un projet qui fonctionne et qui a au plus de fonctionnalités possibles.

## Objectifs

Pour appliquer les connaissances acquises pendant le cours de programmation avancée application et pour aborder les concepts des cours objets, nous sommes amenés à réaliser un projet informatique basé sur la technologie Java.

## Description générale du projet

Pour répondre à cet objectif, notre groupe a décidé de créer une application en Java, qui a comme but la gestion des ressources financières d’une famille.
Le but étant de mieux visualiser les dépenses et de pouvoir facilement les comparer, si besoin.

Cet outil doit intégrer les fonctionnalités suivantes :

* _**Base de données :**_ stockage des diverses informations
* _**MVC :**_ synchronisation de la vue et du contrôleur
* _**Module génération de rapport :**_ ajout/suppression de produits
* _**Module affichage console :**_ interaction en console
* _**Module affichage GUI :**_ interaction en interface graphique
* _**Module gestion famille**_

## Spécifications fonctionnelles

L’utilisateur va pouvoir démarrer l’application, créer son espace personnel et ensuite mettre son budget et ses dépenses.

Afin de faciliter son utilisation et dans le but d'éviter toute mauvaise manipulation par la suite, voici la solution retenue :

* _**Profil utilisateur**_
  * Pourra visualiser les activités payées,
  * Pourra distinguer les dépenses via sa carte bancaire et celles faites au comptant,
  * Pourra voir des graphiques de ses dépenses actuelles, et/ou sur l’année,
  * Il ne pourra pas modifier ses dépenses une fois inscrites, mais l’utilisateur devra vérifier deux fois les informations avant qu’elles soient enregistrées.

* _**Fonctionnement**_
  * Possibilité d’effacer son compte, une fois le mot de passe vérifié,
  * La possibilité d’exporter les résultats.

## Spécifications techniques

Du point de vue technique, nous allons travailler avec Java 13.
Afin de pouvoir l’utiliser librement du point de vue développement le JDK Oracle, nous avons besoin de [AdoptOpenJDK](https://adoptopenjdk.net/?variant=openjdk13&jvmVariant=hotspot).

En ce qu’il concerne la gestion de données, nous allons travailler avec MySQL.
Ce choix a été fait suite à une analyse de notre projet durant laquelle nous nous sommes rendu compte que nous avons besoin d’une base de données relationnelle.
Des BDDR nous avons comparé les plus populaires : MySQL, Oracle et PostgreSQL.
Oracle étant payant et PostgreSQL étant moins utilisés avec les applications Java, nous avons opté pour MySQL.

Pour la programmation de l’application, nous nous basons sur le cours de _« Développement Informatique avancée : application »_ de l’EPHEC, les formations Open Classrooms mais aussi la documentation en ligne que nous pouvons trouver auprès de Java et MySQL.

## Fonctionnement du groupe

La plateforme de développement, la documentation du projet, mais aussi notre avancement seront disponibles à partir des sites Internet suivants :

* <https://github.com/orgs/EphecLLN/teams/projetjava11>
* <https://trello.com/invite/b/hpUHWM1Q/660b222f45a6c916a045076930661c87/billfold-it>

La documentation est composée de plusieurs sections :

* _**In :**_ accueil de l’application, avec les divers membres et un bouton pour ajouter des nouveaux,
* _**Gestion :**_ section qui servira à voir :
  * Le budget restant,
  * Un champ pour introduire une nouvelle dépense et ses caractéristiques,
  * Une liste avec les dernières 3 entrées.
* _**Visualiser :**_ la section des graphiques qui affichera les dépenses d’une maniéré visuelle. Ces graphiques seront affichés en tant que pourcentages dans la console,
* _**À propos :**_ section wiki, permettant d’avoir des explications sur chaque page et de comment utiliser l’application,
* _**Questions :**_ section permettant d’envoyer un mail à l’adresse contant de l’application.

## L'équipe

L’équipe est formée de 3 membres, tel le règlement.
Du point de vue des compétences, elles « frôlent le sol », en ce qu’il concerne le langage Java, mais nous avons tous commencé la formation Java sur Open Classrooms et nous avons aussi commencé à revoir le cours théorique.

Les membres sont :

* CAMPOS CASARES Melvin
* MIRICA Constantin
* PONJEE Aymeric

# Diagrammes UML

# Choix d'implémentation effectués

# Pistes d'amélioration éventuelles

# Conclusion

## Melvin Campos Casares

## Constantin Mirica

## Aymeric Ponjée
