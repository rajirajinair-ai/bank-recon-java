package com.example.reconciliation.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "reconciliation_groups")
public class ReconciliationGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String matchType; // 1:1, 1:N, N:1, N:N

    @Column(nullable = false)
    private String status; // PENDING_APPROVAL, APPROVED, REJECTED

    @ManyToMany
    @JoinTable(
        name = "reconciliation_items",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "transaction_id")
    )
    private Set<Transaction> matchedTransactions;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMatchType() { return matchType; }
    public void setMatchType(String matchType) { this.matchType = matchType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Set<Transaction> getMatchedTransactions() { return matchedTransactions; }
    public void setMatchedTransactions(Set<Transaction> matchedTransactions) { this.matchedTransactions = matchedTransactions; }
}
