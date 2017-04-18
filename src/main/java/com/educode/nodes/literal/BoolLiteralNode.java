package com.educode.nodes.literal;

import com.educode.nodes.base.LeafNode;
import com.educode.types.Type;
import com.educode.visitors.VisitorBase;

/**
 * Created by zen on 3/24/17.
 */
public class BoolLiteralNode extends LeafNode
{
    private boolean _value;

    public BoolLiteralNode(boolean value)
    {
        this._value = value;
        setType(Type.BoolType);
    }

    public boolean getValue()
    {
        return _value;
    }

    @Override
    public Object accept(VisitorBase visitor)
    {
        return visitor.visit(this);
    }
}