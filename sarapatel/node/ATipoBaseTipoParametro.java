/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class ATipoBaseTipoParametro extends PTipoParametro
{
    private PTipoBase _tipoBase_;

    public ATipoBaseTipoParametro()
    {
        // Constructor
    }

    public ATipoBaseTipoParametro(
        @SuppressWarnings("hiding") PTipoBase _tipoBase_)
    {
        // Constructor
        setTipoBase(_tipoBase_);

    }

    @Override
    public Object clone()
    {
        return new ATipoBaseTipoParametro(
            cloneNode(this._tipoBase_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoBaseTipoParametro(this);
    }

    public PTipoBase getTipoBase()
    {
        return this._tipoBase_;
    }

    public void setTipoBase(PTipoBase node)
    {
        if(this._tipoBase_ != null)
        {
            this._tipoBase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoBase_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoBase_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoBase_ == child)
        {
            this._tipoBase_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoBase_ == oldChild)
        {
            setTipoBase((PTipoBase) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
