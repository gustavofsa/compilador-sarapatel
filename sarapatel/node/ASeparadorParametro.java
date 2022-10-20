/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASeparadorParametro extends PSeparadorParametro
{
    private TSeparador _separador_;
    private PParametro _parametro_;

    public ASeparadorParametro()
    {
        // Constructor
    }

    public ASeparadorParametro(
        @SuppressWarnings("hiding") TSeparador _separador_,
        @SuppressWarnings("hiding") PParametro _parametro_)
    {
        // Constructor
        setSeparador(_separador_);

        setParametro(_parametro_);

    }

    @Override
    public Object clone()
    {
        return new ASeparadorParametro(
            cloneNode(this._separador_),
            cloneNode(this._parametro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeparadorParametro(this);
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

    public PParametro getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(PParametro node)
    {
        if(this._parametro_ != null)
        {
            this._parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._separador_)
            + toString(this._parametro_);
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

        if(this._parametro_ == child)
        {
            this._parametro_ = null;
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

        if(this._parametro_ == oldChild)
        {
            setParametro((PParametro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
