/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AParametroSeparadorParametroSeparadorParametroVazio extends PSeparadorParametroVazio
{
    private PParametroSeparadorParametro _parametroSeparadorParametro_;

    public AParametroSeparadorParametroSeparadorParametroVazio()
    {
        // Constructor
    }

    public AParametroSeparadorParametroSeparadorParametroVazio(
        @SuppressWarnings("hiding") PParametroSeparadorParametro _parametroSeparadorParametro_)
    {
        // Constructor
        setParametroSeparadorParametro(_parametroSeparadorParametro_);

    }

    @Override
    public Object clone()
    {
        return new AParametroSeparadorParametroSeparadorParametroVazio(
            cloneNode(this._parametroSeparadorParametro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametroSeparadorParametroSeparadorParametroVazio(this);
    }

    public PParametroSeparadorParametro getParametroSeparadorParametro()
    {
        return this._parametroSeparadorParametro_;
    }

    public void setParametroSeparadorParametro(PParametroSeparadorParametro node)
    {
        if(this._parametroSeparadorParametro_ != null)
        {
            this._parametroSeparadorParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametroSeparadorParametro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parametroSeparadorParametro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parametroSeparadorParametro_ == child)
        {
            this._parametroSeparadorParametro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parametroSeparadorParametro_ == oldChild)
        {
            setParametroSeparadorParametro((PParametroSeparadorParametro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}