# InfinityConnect


Requete SQL pour construire la base de donée (Crée avec pgAdmin 4)


// CREATE TABLE IF NOT EXISTS public.adresse
(
    id_adresse integer NOT NULL DEFAULT nextval('adresse_id_adresse_seq'::regclass),
    ville character(100) COLLATE pg_catalog."default",
    code_postal character(20) COLLATE pg_catalog."default",
    rue character(100) COLLATE pg_catalog."default",
    CONSTRAINT adresse_pkey PRIMARY KEY (id_adresse)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.adresse
    OWNER to postgres;

    
CREATE TABLE IF NOT EXISTS public.civile
(
    id_civile integer NOT NULL DEFAULT nextval('civile_id_civile_seq'::regclass),
    nom character(100) COLLATE pg_catalog."default",
    prenom character(100) COLLATE pg_catalog."default",
    date_naissance date,
    date_deces date,
    commentaire text COLLATE pg_catalog."default",
    dernier_update date,
    incident_declarer integer,
    victime integer,
    id_adresse integer,
    CONSTRAINT civile_pkey PRIMARY KEY (id_civile),
    CONSTRAINT civile_adresse_fkey FOREIGN KEY (id_adresse)
        REFERENCES public.adresse (id_adresse) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.civile
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.crise
(
    id_crise integer NOT NULL,
    id_incident integer,
    titre character(200) COLLATE pg_catalog."default",
    id_hero integer,
    id_adresse integer,
    CONSTRAINT crise_pkey PRIMARY KEY (id_crise),
    CONSTRAINT crise_id_adresse_fkey FOREIGN KEY (id_adresse)
        REFERENCES public.adresse (id_adresse) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT crise_id_hero_fkey FOREIGN KEY (id_hero)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.crise
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS public.hero
(
    id_hero integer NOT NULL DEFAULT nextval('hero_id_hero_seq'::regclass),
    id_civile integer,
    pouvoir character(200) COLLATE pg_catalog."default",
    point_faible character(200) COLLATE pg_catalog."default",
    score double precision,
    commentaire text COLLATE pg_catalog."default",
    CONSTRAINT hero_pkey PRIMARY KEY (id_hero),
    CONSTRAINT id_civile FOREIGN KEY (id_civile)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.hero
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.incident
(
    id_incident integer NOT NULL DEFAULT nextval('incident_id_incident_seq'::regclass),
    id_civile integer,
    id_hero integer,
    id_vilain integer,
    id_organisation integer,
    id_adresse integer,
    type_incident character(100) COLLATE pg_catalog."default",
    date timestamp(6) with time zone,
    commentaire text COLLATE pg_catalog."default",
    CONSTRAINT incident_pkey PRIMARY KEY (id_incident),
    CONSTRAINT adresse FOREIGN KEY (id_adresse)
        REFERENCES public.adresse (id_adresse) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT civile FOREIGN KEY (id_civile)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT hero FOREIGN KEY (id_hero)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT organisation FOREIGN KEY (id_organisation)
        REFERENCES public.organisation (id_organisation) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT vilain FOREIGN KEY (id_vilain)
        REFERENCES public.vilain (id_vilain) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.incident
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS public.litige
(
    id_litige integer NOT NULL,
    id_civile integer,
    type_litige character(200) COLLATE pg_catalog."default",
    concerne integer,
    mission integer,
    commentaire text COLLATE pg_catalog."default",
    CONSTRAINT litige_pkey PRIMARY KEY (id_litige),
    CONSTRAINT litige_concerne_fkey FOREIGN KEY (concerne)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT litige_id_civile_fkey FOREIGN KEY (id_civile)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.litige
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.mission
(
    id_mission integer NOT NULL DEFAULT nextval('mission_id_mission_seq'::regclass),
    id_incident integer,
    id_hero integer,
    titre character(200) COLLATE pg_catalog."default",
    date_debut date,
    date_fin date,
    urgence character(100) COLLATE pg_catalog."default",
    id_adresse integer,
    CONSTRAINT mission_pkey PRIMARY KEY (id_mission),
    CONSTRAINT adresse FOREIGN KEY (id_adresse)
        REFERENCES public.adresse (id_adresse) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT hero FOREIGN KEY (id_hero)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.mission
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS public.note
(
    id_note integer NOT NULL,
    id_civile integer,
    id_mission integer,
    temps interval,
    id_hero integer,
    degat bigint,
    note_total integer,
    commentaire character(200) COLLATE pg_catalog."default",
    CONSTRAINT note_pkey PRIMARY KEY (id_note),
    CONSTRAINT note_id_civile_fkey FOREIGN KEY (id_civile)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT note_id_hero_fkey FOREIGN KEY (id_hero)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.note
    OWNER to postgres;




CREATE TABLE IF NOT EXISTS public.organisation
(
    id_organisation integer NOT NULL,
    nom character(100) COLLATE pg_catalog."default",
    adresse integer,
    dirigeant integer,
    commentaire text COLLATE pg_catalog."default",
    date_ajout date,
    last_update date,
    incident_declarer integer,
    impliquer_mission integer,
    CONSTRAINT organisation_pkey PRIMARY KEY (id_organisation),
    CONSTRAINT adresse FOREIGN KEY (adresse)
        REFERENCES public.adresse (id_adresse) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT dirigeant FOREIGN KEY (dirigeant)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.organisation
    OWNER to postgres;





CREATE TABLE IF NOT EXISTS public.rapport
(
    id_rapport integer NOT NULL,
    id_hero integer,
    commentaire text COLLATE pg_catalog."default",
    id_mission integer,
    nb_crise integer,
    CONSTRAINT rapport_pkey PRIMARY KEY (id_rapport),
    CONSTRAINT rapport_id_hero_fkey FOREIGN KEY (id_hero)
        REFERENCES public.hero (id_hero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.rapport
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS public.vilain
(
    id_vilain integer NOT NULL DEFAULT nextval('vilain_id_vilain_seq'::regclass),
    id_civile integer,
    pouvoire character(100) COLLATE pg_catalog."default",
    point_faible character(100) COLLATE pg_catalog."default",
    danger integer,
    commentaire text COLLATE pg_catalog."default",
    CONSTRAINT vilain_pkey PRIMARY KEY (id_vilain),
    CONSTRAINT id_civile FOREIGN KEY (id_civile)
        REFERENCES public.civile (id_civile) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.vilain
    OWNER to postgres;


