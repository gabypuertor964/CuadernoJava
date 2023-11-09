package com.example.cuadernojava.entities.audit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import com.example.cuadernojava.config.CustomRevisionListener;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.hibernate.envers.RevisionEntity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "revinfo")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "revinfo_seq")
    @SequenceGenerator(
            name = "revinfo_seq",
            sequenceName = "revinfo_seq"
    )
    @RevisionNumber
    private int id;

    @Column("revision_date")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;

}
