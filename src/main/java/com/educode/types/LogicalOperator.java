package com.educode.types;

/**
 * Created by zen on 3/24/17.
 */
public class LogicalOperator
{
    private final byte _kind;
    public static final byte ERROR = 0, EQUALS = 1, NOT_EQUALS = 2, LESS_THAN = 3, LESS_THAN_OR_EQUALS = 4, GREATER_THAN = 5, GREATER_THAN_OR_EQUALS = 6, OR = 7, AND = 8;

    public LogicalOperator(byte kind)
    {
        this._kind = kind;
    }

    @Override
    public boolean equals(Object o)
    {
        return o instanceof LogicalOperator && ((LogicalOperator) o)._kind == this._kind;

    }

    @Override
    public String toString()
    {
        switch (_kind)
        {
            case EQUALS:
                return "EQUALS";
            case NOT_EQUALS:
                return "NOT EQUALS";
            case LESS_THAN:
                return "LESS THAN";
            case LESS_THAN_OR_EQUALS:
                return "LESS THAN OR EQUALS:";
            case GREATER_THAN:
                return "GREATER THAN";
            case GREATER_THAN_OR_EQUALS:
                return "GREATER THAN OR EQUALS";
            case OR:
                return "OR";
            case AND:
                return "AND";
            case ERROR:
                return "ERROR";
            default:
                return "UNDEFINED"; // Should not happen
        }
    }

    public byte getKind()
    {
        return _kind;
    }

    public static LogicalOperator Equals = new LogicalOperator(EQUALS);
    public static LogicalOperator NotEquals = new LogicalOperator(NOT_EQUALS);

    public static LogicalOperator LessThan = new LogicalOperator(LESS_THAN);
    public static LogicalOperator LessThanOrEquals = new LogicalOperator(LESS_THAN_OR_EQUALS);

    public static LogicalOperator GreaterThan = new LogicalOperator(GREATER_THAN);
    public static LogicalOperator GreaterThanOrEquals = new LogicalOperator(GREATER_THAN_OR_EQUALS);

    public static LogicalOperator Or = new LogicalOperator(OR);
    public static LogicalOperator And = new LogicalOperator(AND);

    public static LogicalOperator Error = new LogicalOperator(ERROR);
}
