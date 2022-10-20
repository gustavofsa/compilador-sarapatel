/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASeparadorExpSeparadorExp extends PSeparadorExp
{
    private TSeparador _separador_;
    private PExp _exp_;

    public ASeparadorExpSeparadorExp()
    {
        // Constructor
    }

    public ASeparadorExpSeparadorExp(
        @SuppressWarnings("hiding") TSeparador _separador_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setSeparador(_separador_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ASeparadorExpSeparadorExp(
            cloneNode(this._separador_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeparadorExpSeparadorExp(this);
    }

    public TSeparador getSeparador()
    {
        return this._separador_;
    }

    public void setSeparador(TSeparador node)
    {
        if(this._separador_ != null)
        {
            this._separador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separador_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._separador_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._separador_ == child)
        {
            this._separador_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._separador_ == oldChild)
        {
            setSeparador((TSeparador) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
