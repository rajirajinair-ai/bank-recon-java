# QA Test Cases

## 1. Import Framework Testing
- **TC-IMP-001:** Verify CSV import with valid 50,000 transactions completes within 2 minutes.
- **TC-IMP-002:** Verify XLSX import validates headers and rejects invalid formats.
- **TC-IMP-003:** Verify MT940 file parsing correctly stages the transactions.
- **TC-IMP-004:** Verify system rejects imports with missing mandatory fields (e.g., date, amount).

## 2. Reconciliation Engine Testing
- **TC-REC-001:** Verify 1:1 matching successfully pairs transactions using Exact Amount and Reference Number.
- **TC-REC-002:** Verify 1:N matching (One Bank Entry to Multiple Internal).
- **TC-REC-003:** Verify N:1 matching (Multiple Receipts to One Settlement).
- **TC-REC-004:** Verify Date Tolerance matching finds pairs within the specified date range.
- **TC-REC-005:** Verify 100,000 transactions match process completes within 5 minutes.

## 3. Workflow & Manual Matching
- **TC-WF-001:** Verify a user can manually match unmatched transactions.
- **TC-WF-002:** Verify matched transactions enter the Review Queue.
- **TC-WF-003:** Verify an Approver can approve or reject a match group.
- **TC-WF-004:** Verify rejected matches are returned to the unmatched pool.

## 4. Reporting Testing
- **TC-REP-001:** Verify Bank Reconciliation Statement (BRS) generates correctly in PDF.
- **TC-REP-002:** Verify Match Summary exports properly to Excel.
- **TC-REP-003:** Verify Pending Reconciliation report accurately reflects unmatched records.

## 5. Security & Authorization
- **TC-SEC-001:** Verify users can only access endpoints authorized for their role.
- **TC-SEC-002:** Verify session timeout logs out the user after inactivity.
- **TC-SEC-003:** Verify all actions (import, match, approve) are logged in the Audit tables.
