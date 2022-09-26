/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class AIdAtribuicaoIds extends PIds
{
    private PIdAtribuicao _idAtribuicao_;

    public AIdAtribuicaoIds()
    {
        // Constructor
    }

    public AIdAtribuicaoIds(
        @SuppressWarnings("hiding") PIdAtribuicao _idAtribuicao_)
    {
        // Constructor
        setIdAtribuicao(_idAtribuicao_);

    }

    @Override
    public Object clone()
    {
        return new AIdAtribuicaoIds(
            cloneNode(this._idAtribuicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdAtribuicaoIds(this);
    }

    public PIdAtribuicao getIdAtribuicao()
    {
        return this._idAtribuicao_;
    }

    public void setIdAtribuicao(PIdAtribuicao node)
    {
        if(this._idAtribuicao_ != null)
        {
            this._idAtribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idAtribuicao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idAtribuicao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idAtribuicao_ == child)
        {
            this._idAtribuicao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idAtribuicao_ == oldChild)
        {
            setIdAtribuicao((PIdAtribuicao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
