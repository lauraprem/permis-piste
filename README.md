# permis-piste

Voici la liste des requetes que ce server REST propose :

ACTION :
récupérer toutes les actions
GET server/Action/

récupérer une action à l'aide de son id
GET server/Action/{id}

supprimer une action 
DELETE server/Action/{id}

ajouter une action : passer dans le body l'objet en JSON sans l'id
POST server/Action/

modifier une action : passer dans le body l'objet en JSON avec l'id
PUT server/Action/{id}

chercher une action avec n'importe quel attribut
GET server/Action/Search/{Search} 

APPRENANT : 
similaire à Action 

JEU :
similaire à Action

INDICATEUR :
similaire à Action

chercher un indicateur à l'aide de l'action associé :
GET server/Indicateur/Action/{id}

MISSION :
similaire à Action

chercher les objectif d'une mission
GET server/Mission/{idMission}/Objectif

OBJECTIF :
similaire à Action

chercher un objectif pour une mission
GET server/Objectif/{id}/Action

REGLE :
similaire à Action

chercher les règles d'une action
GET server/Regle/Action/{id}

EST_ASSOCIE : 
Ajouter un est_associer : passer l'objet en JSON
POST server/EstAssocie/

Supprimer un est_associe
DELETE server/EstAssocie/

FIXE :
Similaire à est_associe

OBTIENT :
similaire à est_associe

POSSEDE : 
similaire à est_associe
