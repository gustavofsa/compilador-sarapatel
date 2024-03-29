/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ARealTipagem extends PTipagem
{
    private TDecimal _decimal_;

    public ARealTipagem()
    {
        // Constructor
    }

    public ARealTipagem(
        @SuppressWarnings("hiding") TDecimal _decimal_)
    {
        // Constructor
        setDecimal(_decimal_);

    }

    @Override
    public Object clone()
    {
        return new ARealTipagem(
            cloneNode(this._decimal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealTipagem(this);
    }

    public TDecimal getDecimal()
    {
        return this._decimal_;
    }

    public void setDecimal(TDecimal node)
    {
        if(this._decimal_ != null)
        {
            this._decimal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decimal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decimal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decimal_ == child)
        {
            this._decimal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decimal_ == oldChild)
        {
            setDecimal((TDecimal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
